<script setup lang="ts">
import { ref } from 'vue';

import AppFooter from './components/patterns/AppFooter.vue';
import AppTopbar from './components/patterns/AppTopbar.vue';

const mobileMenuActive = ref(false);
</script>

<template>
  <AppTopbar />

  <div class="layout-main-container">
    <div class="layout-main"></div>
    <AppFooter />
  </div>

  <transition name="layout-mask">
    <div class="layout-mask p-component-overlay" v-if="mobileMenuActive"></div>
  </transition>
</template>

<style lang="scss">
@import './assets/styles/App.scss';
</style>
