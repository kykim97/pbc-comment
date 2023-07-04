
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import CommentCommentManager from "./components/listers/CommentCommentCards"
import CommentCommentDetail from "./components/listers/CommentCommentDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/comments/comments',
                name: 'CommentCommentManager',
                component: CommentCommentManager
            },
            {
                path: '/comments/comments/:id',
                name: 'CommentCommentDetail',
                component: CommentCommentDetail
            },



    ]
})
