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
        component: () => import('')
      },
      {
        path: '500',
        name: 'Page500',
        component: () => import('')
      },
      {
        path: 'login',
        name: 'Login',
        component: () => import('')
      },
      {
        path: 'register',
        name: 'Register',
        component: () => import('')
      }
    ]
  }
];

const router = createRouter({
  history: createWebHashHistory(),
  routes
});

export default router;