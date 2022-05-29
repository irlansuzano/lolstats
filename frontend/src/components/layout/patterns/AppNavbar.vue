<script setup lang="ts">
import Button from 'primevue/button';
</script>

<template>
  <nav class="navbar navbar-expand-lg fixed-top navbar-dark bg-dark px-4 py-4">
    <div class="container-fluid">
      <a class="navbar-brand" href="#">LoL Stats</a>
      <button class="navbar-toggler" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasNavbar"
        aria-controls="offcanvasNavbar">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="offcanvas offcanvas-end text-white bg-dark" tabindex="-1" id="offcanvasNavbar"
        aria-labelledby="offcanvasNavbarLabel">
        <div class="offcanvas-header">
          <h5 class="offcanvas-title" id="offcanvasNavbarLabel">LoL Stats</h5>
          <button type="button" class="btn-close btn-close-white" data-bs-dismiss="offcanvas"
            aria-label="Close"></button>
        </div>
        <div class="offcanvas-body">
          <ul class="navbar-nav justify-content-start flex-grow-1 ps-3">
            <li class="nav-item pe-2">
              <Button label="CRONOGRAMA"
                class="p-button-text p-button-rounded border-none font-light line-height-2 text-blue-500" />
            </li>
            <li class="nav-item ps-2">
              <Button label="COLOCAÇÕES"
                class="p-button-text p-button-rounded border-none font-light line-height-2 text-blue-500" />
            </li>
          </ul>
          <ul class="navbar-nav justify-content-end">
            <li class="nav-item pe-3">
              <Button label="LOGIN"
                class="p-button-text p-button-rounded border-none font-light line-height-2 text-blue-500" />
            </li>
            <li class="nav-item ps-3">
              <Button label="REGISTRE-SE"
                class="p-button-rounded border-none ml-5 font-light text-white line-height-2 bg-blue-500" />
            </li>
          </ul>
        </div>
      </div>
    </div>
  </nav>
</template>

<style scoped>
</style>