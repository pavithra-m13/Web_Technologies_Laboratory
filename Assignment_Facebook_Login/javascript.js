function validate() {
    var email = document.getElementById('email').value;
    var password = document.getElementById('password').value;
    if (email === '' || password === '' || email.indexOf('@')==-1) {
        alert('Invalid email or password. Please try again.');
    } else {
        alert('Login successful!');
        document.getElementById("login-form").reset();    }
}
