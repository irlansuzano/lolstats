import { createApp } from 'vue'
import App from './App.vue'
const app = createApp(App);

import PrimeVue from 'primevue/config';
app.use(PrimeVue);

app.mount('#app');
