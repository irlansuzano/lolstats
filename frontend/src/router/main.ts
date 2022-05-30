import { h, resolveComponent } from "vue";
import { createRouter, createWebHashHistory } from "vue-router";

import Layout from "../components/layout/Layout.vue";
import Page404 from "../views/pages/Page404.vue";
import Page500 from "../views/pages/Page500.vue";
import Login from "../views/pages/Login.vue";
import Register from "../views/pages/Register.vue";

const routes = [
  {
    path: '/',
    name: 'layout',
    component: Layout,
    children: [
      {
        path: '/home',
        name: 'home-page',
        component: () => import('../views/Home.vue'),
        meta: {
          titulo: 'Home Page'
        }
      }
    ]
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