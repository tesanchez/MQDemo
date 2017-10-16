'use strict';

var url = require('url');


var Sources = require('./SourcesService');


module.exports.createSource = function createSource (req, res, next) {
  Sources.createSource(req.swagger.params, res, next);
};

module.exports.deleteSource = function deleteSource (req, res, next) {
  Sources.deleteSource(req.swagger.params, res, next);
};

module.exports.getSource = function getSource (req, res, next) {
  Sources.getSource(req.swagger.params, res, next);
};

module.exports.getSourceList = function getSourceList (req, res, next) {
  Sources.getSourceList(req.swagger.params, res, next);
};

module.exports.partialUpdateSource = function partialUpdateSource (req, res, next) {
  Sources.partialUpdateSource(req.swagger.params, res, next);
};
