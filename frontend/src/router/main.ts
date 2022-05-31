import { createRouter, createWebHashHistory } from "vue-router";

import App from "../App.vue";
import Login from "../views/pages/Login.vue";
import Register from "../views/pages/Register.vue";

const routes = [
  {
    path: '/',
    name: 'app',
    component: App
  },
  {
    path: '/login',
    name: 'login',
    component: Login
  },
  {
    path: '/register',
    name: 'register',
    component: Register
  }
];

const router = createRouter({
  history: createWebHashHistory(),
  routes
});

export default router;