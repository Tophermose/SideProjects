/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function noun_function() {
    var noun_node_list = document.getElementsByClassName("noun");
    //This creates a NodeList of all tags with the given class: "noun".

    for (var i = 0; i < noun_node_list.length; i++) {
        //This creates a loop that will cycle through every instance of the class: "noun" and apply the code within the block to it.
        var x = document.getElementsByClassName("main")[0];
        //This creates a variable based on the class name "main" with the position of this class' use being [0] to allow for further manipulation
        //"Main" is a parent class that allows child classes to be manipulated under one umbrella class name. 
        x.getElementsByClassName("noun")[i].style.color = "red";
        //This uses the variable x, and applies an attribute change to every <span> with the class: "noun", iterating through every noun
    }
}

function verb_function() {
    var verb_node_list = document.getElementsByClassName("verb");

    for (var i = 0; i < verb_node_list.length; i++) {
        var x = document.getElementsByClassName("main")[0];
        x.getElementsByClassName("verb")[i].style.color = "blue";
    }
}

function adverb_function() {
    var adverb_node_list = document.getElementsByClassName("adverb");

    for (var i = 0; i < adverb_node_list.length; i++) {
        var x = document.getElementsByClassName("main")[0];
        x.getElementsByClassName("adverb")[i].style.backgroundColor = "yellow";
        //x.getElementsByClassName("adverb")[i].style.color = "black";
    }
}

window.onload = function() {
    noun_function();
    verb_function();
    adverb_function();
};

/*window.onload can only be used for one function at a time, so I didn't need a function to cover all of my other functions.
 * I just needed an anonymous function that would use window.onload but allow me to call all three of my functions.
*/
