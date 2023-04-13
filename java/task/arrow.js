function person()
{
    this.name='Jack',
    this.age=25,
    this.sayName=funciton()
    {
        console.log(this.age);
        function innerFunc()
    {
        console.log(this.age);
        console.log(this);
    }
    innerFunc();
}
}
let x=new person();
x.sayName();