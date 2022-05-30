<script setup lang="ts">
import { ref } from 'vue';

import Button from 'primevue/button';
import Divider from 'primevue/divider';
import InputText from 'primevue/inputtext';
import Password from 'primevue/password';

const name = ref('');
const email = ref('');
const password = ref('');
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
            <span class="text-600 font-medium">Cadastre-se gratuitamente</span>
          </div>
          <div class="w-full md:w-10 mx-auto">
            <label for="name" class="block text-900 text-xl font-medium mb-2">Nome</label>
            <InputText id="name" v-model="name" type="text" class="w-full mb-3" placeholder="Nome"
              style="padding:1rem;" />
            <label for="email" class="block text-900 text-xl font-medium mb-2">Email</label>
            <InputText id="email" v-model="email" type="text" class="w-full mb-3" placeholder="Email"
              style="padding:1rem;" />
            <label for="password" class="block text-900 font-medium text-xl mb-2">Senha</label>
            <Password id="password" v-model="password" placeholder="Senha" class="w-full mb-3" inputClass="w-full"
              inputStyle="padding:1rem">
              <template #header>
                <h6>Crie uma senha</h6>
              </template>
              <template #footer>
                <Divider />
                <p class="mt-2">Sugestões</p>
                <ul class="pl-2 ml-2 mt-0" style="line-height: 1.5">
                  <li>Pelo menos uma letra minúscula</li>
                  <li>Pelo menos uma letra maiúscula</li>
                  <li>Pelo menos um caractere numérico</li>
                  <li>Mínimo de 8 caracteres</li>
                </ul>
              </template>
            </Password>
            <Button label="Cadastrar" class="w-full p-3 text-xl"></button>
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