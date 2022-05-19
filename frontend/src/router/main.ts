import { h, resolveComponent } from "vue";
import { createRouter, createWebHashHistory } from "vue-router";

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
        component: () => import('@/views/pages/Page404.vue')
      },
      {
        path: '500',
        name: 'Page500',
        component: () => import('@/views/pages/Page500.vue')
      },
      {
        path: 'login',
        name: 'Login',
        component: () => import('@/views/pages/Login.vue')
      },
      {
        path: 'register',
        name: 'Register',
        component: () => import('@/views/pages/Register.vue')
      }
    ]
  }
];

const router = createRouter({
  history: createWebHashHistory(),
  routes
});

export default router;