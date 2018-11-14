/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function noun_function() {
    var noun_node_list = document.getElementsByClassName("noun");
    //This creates a NodeList of all tags with the given class: "noun".
    //Works without .innerHTML but don't know why.

    for (var i = 0; i < noun_node_list.length; i++) {
        //This creates a loop that will cycle through every instance of the class: "noun" and apply the code within the block to it.
        var y = document.fontcolor("red");
        //This creates a variable based on the class name "main" with the position of this class' use being [0] to allow for further manipulation
        //"Main" is a parent class that allows child classes to be manipulated under one umbrella class name. 
        document.getElementsByClassName("noun")[i].innerHTML = y;
        //This uses the variable x, and applies an attribute change to every <span> with the class: "noun", iterating through every noun
    }
}

function verb_function() {
    var verb_node_list = document.getElementsByClassName("verb");

    for (var i = 0; i < verb_node_list.length; i++) {
        var y = document.fontcolor("blue");
        document.getElementsByClassName("verb")[i].innerHTML = y;
    }
}

function adverb_function() {
    var adverb_node_list = document.getElementsByClassName("adverb");

    for (var i = 0; i < adverb_node_list.length; i++) {
        var y = document.bgColor("yellow");
        document.getElementsByClassName("adverb")[i].innerHTML = y;
        //x.getElementsByClassName("adverb")[i].style.color = "black";
    }
}
window.onload = noun_function();
window.onload = verb_function();
window.onload = adverb_function();
