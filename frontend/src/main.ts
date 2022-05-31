import { createApp } from 'vue'
import App from './App.vue'
const app = createApp(App);

import PrimeVue from 'primevue/config';
app.use(PrimeVue);

import 'primeflex/primeflex.css';
import 'primeicons/primeicons.css';
import 'primevue/resources/primevue.min.css';
import 'primevue/resources/themes/lara-light-blue/theme.css';

import './assets/styles/layout.scss';

import router from './router/main';

import StyleClass from 'primevue/styleclass';
app.directive('styleclass', StyleClass);

app.use(router);

app.mount('#app');
