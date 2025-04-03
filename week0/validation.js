function check()
{
var pwd = document.getElementById('pwd').value;
if(pwd.length < 5){
document.getElementById('msg').innerHTML = "weak";
}
else if(pwd.length >=5 && pwd.length < 8)
document.getElementById('msg').innerHTML = "good";
else
document.getElementById('msg').innerHTML = "strong";
}

function validate()
{
var pwds = document.getElementsByClassName('pwd');
if(pwds[0].value != pwds[1].value){
     document.getElementById('msg2').innerHTML = "Password Mismatch!!";
 return false;
}
else{
 alert("form Submitted succesfully")
}
}
