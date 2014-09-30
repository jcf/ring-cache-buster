# Ring-Cache-Buster

[![Build Status](https://travis-ci.org/listora/ring-cache-buster.svg?branch=master)](https://travis-ci.org/listora/ring-cache-buster)

Ring middleware for preventing caching.

This middleware adds a [`Cache-Control`][] header to all wrapped responses that
instruct others to never cache the generated response. This affects both edge
caches and browser caches.

## Installation

Add the following dependency to your `project.clj`:

    [ring/ring-ssl "0.1.0"]

## License

Copyright © 2014 Listora

Released under the MIT license, same as Ring.

[`Cache-Control`]: http://www.w3.org/Protocols/rfc2616/rfc2616-sec13.html
