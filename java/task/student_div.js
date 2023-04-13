function u_name(name) {
    const pattern = /^[A-Z]{1}[a-z]{1,10}[@][a-z]{5,8}$/;
    return pattern.test(name);
  }
  console.log(u_name('Divyaintel@gmail')); 
  console.log(u_name('Divya@intel')); 
  console.log(u_name('Divya.intel'));