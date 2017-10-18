'use strict';

var url = require('url');


var Default = require('./DefaultService');


module.exports.sampleResourceGET = function sampleResourceGET (req, res, next) {
  Default.sampleResourceGET(req.swagger.params, res, next);
};
