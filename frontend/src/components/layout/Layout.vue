<script setup lang="ts">
import AppNavbar from './patterns/AppNavbar.vue';
import AppFooter from './patterns/AppFooter.vue';
</script>

<template>
  <AppNavbar />
  <div style="min-height: 34vw; background-color: #f3f2f1;">
    <router-view></router-view>
  </div>
  <AppFooter />
</template>

<style>
</style>