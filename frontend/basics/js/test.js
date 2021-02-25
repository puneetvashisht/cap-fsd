function test(){
    console.log('test function invoked');
    var str = document.getElementById('borderblack').innerText;
    var revStr = str.split('').reverse().join('');
    document.getElementById('borderblack').innerText = revStr;
}
