import { createApp } from 'vue'
import App from './App.vue'
const app = createApp(App);

import PrimeVue from 'primevue/config';
app.use(PrimeVue);

import 'primevue/resources/themes/lara-light-blue/theme.css';
import 'primevue/resources/primevue.min.css';
import 'primeicons/primeicons.css';

app.mount('#app');
