const frisby = require('frisby');

const Joi = frisby.Joi;

it('should return status 200', function () {
   return frisby.get('https://www.shoecarnival.com/manifest.json')
     .expect("status", 200)
     .expect("json","background_color","#fff")
     .expect("json","name","Shoe Carnival")
     .expect("json","short_name","Shoe Carnival")
     .expect("json","start_url","/")
     .expect("json","theme_color","#002596")
     .expect("json","display","standalone")
     .expect("json","orientation","portrait-primary")
});
