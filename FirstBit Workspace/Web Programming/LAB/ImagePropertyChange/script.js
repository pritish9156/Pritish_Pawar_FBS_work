document.addEventListener('DOMContentLoaded', ()=>{

    let mainImage = document.querySelector('.main-image img');

    let shapeInputBox = document.querySelector('#show-shape');

    let shapeOptionDiv = document.querySelector('#show-shape-option');

    let applyButton = document.querySelector('#apply-btn');

    let borderCheckbox = document.querySelector('#border');


    shapeInputBox.addEventListener('change', ()=>{

        if(shapeInputBox.checked){
            shapeOptionDiv.style.display = 'block';
        }
        else{
            shapeOptionDiv.style.display = 'none';
        }

    });

    applyButton.addEventListener('click', ()=>{

        let selectedShape = document.querySelector('input[name="shape"]:checked');


        // Shape changing
        if(selectedShape){

            if(selectedShape.id === 'square'){
                mainImage.style.borderRadius = '0px';
            }

            else if(selectedShape.id === 'circle'){
                mainImage.style.borderRadius = '50%';
            }

            else if(selectedShape.id === 'octagone'){
                mainImage.style.clipPath =
                'polygon(30% 0%, 70% 0%, 100% 30%, 100% 70%, 70% 100%, 30% 100%, 0% 70%, 0% 30%)';
            }

        }


        if(borderCheckbox.checked){
            mainImage.style.border = '5px solid red';
        }
        else{
            mainImage.style.border = 'none';
        }

    });

});