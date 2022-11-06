const frisby = require('frisby');

const Joi = frisby.Joi;

it('should return status 200', function () {
     return frisby.get('https://www.shoecarnival.com/api/session?__v__=A2rlwdUz2B-rBRZ0UElOv')
        .expect("status", 200)
          .expect("json", "signedIn", false)
          .expect('jsonTypes', 'customer', {
              'authType': Joi.string().required(),
              'customerId': Joi.string().required() })
          .expect('jsonTypes', 'cart', {
               '_type': Joi.string().required(),
               '_resource_state': Joi.string().required(), 
               'adjustedMerchandizeTotalTax' : Joi.number().integer(),
               'adjustedShippingTotalTax' : Joi.number().integer(),
                'agentBasket': false,
                'basketId' : Joi.string().required(), 
                'channelType' : Joi.string().required(), //'storefront',
                'currency' : Joi.string().required(), //'USD',
               'lastModified' : Joi.string().required(), 
               'merchandizeTotalTax' : Joi.number().integer(),// 0,
               'orderTotal' : Joi.number().integer(),//0,
               'productSubTotal' : Joi.number().integer(),//0,
               'productTotal' :Joi.number().integer(),// 0,
               'shippingTotal' : Joi.number().integer(),//0,
               'shippingTotalTax' : Joi.number().integer(),//0,
               'taxation' : Joi.string().required(), //'net',
               'taxTotal' : Joi.number().integer(),//0,
               'cHeadlessEnvironment' : Joi.string().required(), //'production',
               'cHeadlessOrigin' : true,
               'total' : Joi.number().integer()//0 
            })
        .expect("json", 'store', null)
        .expect('json', 'usid', Joi.string().required())
        //.expect('json', 'cuid', "Z3KEbHJuELsiAddJkzyjC") 
       
});