import { h, resolveComponent } from "vue";
import { createRouter, createWebHashHistory } from "vue-router";

import Page404 from "../views/pages/Page404.vue";
import Page500 from "../views/pages/Page500.vue";
import Login from "../views/pages/Login.vue";
import Register from "../views/pages/Register.vue";

const routes = [
  {
    path: '/pages',
    name: 'Pages',
    redirect: '/pages/404',
    component: {
      render() {
        return h(resolveComponent('router-view'))
      },
    },
    children: [
      {
        path: '404',
        name: 'Page404',
        component: Page404
      },
      {
        path: '500',
        name: 'Page500',
        component: Page500
      },
      {
        path: 'login',
        name: 'Login',
        component: Login
      },
      {
        path: 'register',
        name: 'Register',
        component: Register
      }
    ]
  }
];

const router = createRouter({
  history: createWebHashHistory(),
  routes
});

export default router;