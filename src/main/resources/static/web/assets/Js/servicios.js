const {createApp} = Vue;

createApp({
    
    data(){
        return{

        }
    },

    created(){

    },

    mounted(){
        
    },

    methods: {

        verDetallesServicio1: function (value) {
            let form = document.querySelector('.flip-card1 .flip-card-inner1');
            if (value == 'front') {
                form.classList.add('girarServicio');
            }
            else if (value == 'back') {
                form.classList.remove('girarServicio');
            }
        },
        verDetallesServicio2: function (value) {
            let form = document.querySelector('.flip-card2 .flip-card-inner2');
            if (value == 'front') {
                form.classList.add('girarServicio');
            }
            else if (value == 'back') {
                form.classList.remove('girarServicio');
            }
        },
        verDetallesServicio3: function (value) {
            let form = document.querySelector('.flip-card3 .flip-card-inner3');
            if (value == 'front') {
                form.classList.add('girarServicio');
            }
            else if (value == 'back') {
                form.classList.remove('girarServicio');
            }
        },
        verDetallesServicio4: function (value) {
            let form = document.querySelector('.flip-card4 .flip-card-inner4');
            if (value == 'front') {
                form.classList.add('girarServicio');
            }
            else if (value == 'back') {
                form.classList.remove('girarServicio');
            }
        },


    },

    
}).mount("#app")