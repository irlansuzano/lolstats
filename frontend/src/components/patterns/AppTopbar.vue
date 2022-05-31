<script setup lang="ts">
import Button from 'primevue/button';
</script>

<template>
  <div class="layout-topbar">
    <router-link to="/" class="layout-topbar-logo">
      <!-- <img alt="Logo" :src="topbarImage()" /> -->
      <span>LOL STATS</span>
    </router-link>

    <button class="p-link layout-topbar-menu-button layout-topbar-button" v-styleclass="{
      selector: '@next', enterClass: 'hidden', enterActiveClass: 'scalein',
      leaveToClass: 'hidden', leaveActiveClass: 'fadeout', hideOnOutsideClick: true
    }">
      <i class="pi pi-ellipsis-v"></i>
    </button>
    <ul class="layout-topbar-menu hidden lg:flex origin-top">
      <li>
        <button class="p-link layout-topbar-button">
          <i class="pi pi-calendar"></i>
          <span>Cronograma</span>
        </button>
      </li>
      <li>
        <button class="p-link layout-topbar-button">
          <i class="pi pi-sign-in"></i>
          <span>Login</span>
        </button>
      </li>
    </ul>
  </div>
</template>

<style scoped>
</style>