import { createApp } from 'vue'
import App from './App.vue'
const app = createApp(App);

import PrimeVue from 'primevue/config';
app.use(PrimeVue);

import router from './router/main';
app.use(router);

app.mount('#app');
