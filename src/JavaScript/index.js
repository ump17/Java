function add(a){
    return function(b){
        if(b) return add(a+b);
        return a;
    }
}


console.log(add(6)(1)(11)(8));
