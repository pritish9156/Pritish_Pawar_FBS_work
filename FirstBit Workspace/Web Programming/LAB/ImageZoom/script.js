document.addEventListener("DOMContentLoaded", ()=>{

    images = document.querySelectorAll('.image-row img')
    main = document.querySelector('.main-image img')

    images.forEach(element => {
        element.addEventListener('click', (e) => {
            main.src = e.target.src
        })
    });
})