function sync(){
    return 'synch function invokedd';
}

function async(callback){
    setTimeout(()=>{
        callback('async function invoked');
    }, 0)

    // return 'synch function invokedd';
}



console.log('starting...')

// var result = sync();
// console.log(result);


async(function(result){
    console.log(result)
});

console.log('finished..')