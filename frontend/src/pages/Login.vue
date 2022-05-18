<script setup lang="ts">
import { ref } from 'vue';

import useVuelidate from '@vuelidate/core';
import { required, email } from '@vuelidate/validators';

import Button from 'primevue/button';
import InputText from 'primevue/inputtext';
import Password from 'primevue/password';

const userModel = ref({
  email: '',
  senha: ''
});

const rules = {
  email: { required },
  senha: { required, email }
}

const v$ = useVuelidate(rules, userModel);

const handleSubmit = ref();
</script>

<template>
  <form @submit.prevent="handleSubmit(!v$.$invalid)">
    <div class="mb-3">
      <div class="p-float-label p-input-icon-right">
        <i class="pi pi-envelope"></i>
        <InputText id="email" v-model="v$.email.$model" :class="{ 'p-invalid': v$.email.$invalid }"
          aria-describedby="email-error" class="w-100" />
        <label for="email">Email</label>
      </div>
      <span v-if="v$.email.$error">
        <span id="email-error" v-for="(error, index) of v$.email.$errors" :key="index">
          <small class="p-error">{{ error.$message }}</small>
        </span>
      </span>
    </div>
    <div class="mb-3">
      <div class="p-float-label">
        <Password id="senha" v-model="v$.senha.$model" :feedback="false" :class="{ 'p-invalid': v$.senha.$invalid }"
          class="w-100" />
        <label for="senha">Senha</label>
      </div>
      <small></small>
    </div>
    <Button type="submit" label="Login" class="w-100" />
  </form>
</template>

<style>
</style>