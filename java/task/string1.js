protect_email = function (user) 
{
    var avg, splitted,x, y;
    splitted = user.split("@");
    x = splitted[0];
    avg = x.length / 2;
    x = x.substring(0, (x.length - avg));
    y = splitted[1];
    return x + "...@" + y;
};

console.log(protect_email("robin_singh@example.com"));