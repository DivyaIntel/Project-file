let myObject = {
    name: "John",
    age: 30,
    address: {
      street: "123 Main St",
      city: "Anytown",
      state: "CA"
    },
      getFullName: function() {
      return this.name + " Smith";
    }
  };
  console.log(myObject.getFullName()); 
  console.log(myObject["getFullName"]());