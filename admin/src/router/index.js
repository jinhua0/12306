import {createRouter, createWebHistory} from 'vue-router'

const routes = [{
    path: '/', // name属性可忽略
    component: () => import(/* webpackChunkName: "about" */ '../views/ConsoleView.vue'),
    children: [
        {
            // 二级路由path=父path+path='/welcome'
            path: 'welcome',
            component: () => import(/* webpackChunkName: "about" */ '../views/ConsoleSubViews/WelcomeView.vue')
        },
        {
            path: 'about',
            component: () => import('../views/AboutView.vue')
        }]
}, {
    path: '',
    redirect: '/welcome'
}]

const router = createRouter({
    history: createWebHistory(process.env.BASE_URL), routes
})

export default router
