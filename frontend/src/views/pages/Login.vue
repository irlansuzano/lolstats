<script setup lang="ts">
import { ref } from 'vue';

import { useVuelidate } from "@vuelidate/core";
import { email, required } from "@vuelidate/validators";

import Button from 'primevue/button';
import Divider from 'primevue/divider';
import InputText from 'primevue/inputtext';
import Password from 'primevue/password';

const userModel = ref({
  email: '',
  password: ''
});

const rules = {
  email: { required },
  password: { required, email }
};

const v$ = useVuelidate(rules, userModel);

const logar = async () => {
  try {

  } catch (response: any) {
    if (response.status != 400)
      return;
  }
};
</script>

<template>
  <div class="surface-0 flex align-items-center justify-content-center min-h-screen min-w-screen overflow-hidden">
    <div class="grid justify-content-center p-2 lg:p-0" style="min-width:80%">
      <!-- <div class="col-12 mt-5 xl:mt-0 text-center">
        <img :src="'layout/images/logo-' + logoColor + '.svg'" alt="Sakai logo" class="mb-5"
          style="width:81px; height:60px;">
      </div> -->
      <div class="col-12 xl:col-6"
        style="border-radius:56px; padding:0.3rem; background: linear-gradient(180deg, var(--primary-color), rgba(33, 150, 243, 0) 30%);">
        <div class="h-full w-full m-0 py-7 px-4"
          style="border-radius:53px; background: linear-gradient(180deg, var(--surface-50) 38.9%, var(--surface-0));">
          <div class="text-center mb-5">
            <div class="text-900 text-3xl font-medium mb-3">LOL STATS</div>
            <span class="text-600 font-medium">Faça login para continuar</span>
          </div>
          <div class="w-full md:w-10 mx-auto">
            <label for="email" class="block text-900 text-xl font-medium mb-2">Email</label>
            <InputText id="email" v-model="v$.email.$model" type="text" class="w-full mb-3" placeholder="Email"
              style="padding:1rem;" />
            <label for="password" class="block text-900 font-medium text-xl mb-2">Senha</label>
            <Password id="password" v-model="v$.password.$model" :feedback="false" placeholder="Senha"
              class="w-full mb-3" inputClass="w-full" inputStyle="padding:1rem"></Password>
            <Button label="Entrar" icon="pi pi-sign-in" class="w-full p-3 text-xl"></Button>
            <Divider align="center" type="dashed">
              <b class="text-900 font-medium text-xl">OU</b>
            </Divider>
            <router-link :to="{ name: 'register' }">
              <Button label="Registre-se" icon="pi pi-user-plus" class="p-button-success w-full p-3 text-xl"></Button>
            </router-link>
            <div class="col-12 mt-5 text-center">
              <i class="pi pi-fw pi-arrow-left text-blue-500 mr-2" style="vertical-align:center;"></i>
              <router-link to="/" class="text-blue-500">Ir para página inicial</router-link>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<style scoped>
.pi-eye {
  transform: scale(1.6);
  margin-right: 1rem;
}

.pi-eye-slash {
  transform: scale(1.6);
  margin-right: 1rem;
}
</style>