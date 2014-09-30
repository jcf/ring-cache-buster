(ns ring.middleware.cache-buster
  (:require [ring.util.response :refer [header]]))

(defn wrap-cache-buster
  "Prevents any and all HTTP caching by adding a Cache-Control header
  that marks contents as private and non-cacheable."
  [handler]
  (fn wrap-cache-buster-handler [response]
    (header (handler response) "cache-control" "private, max-age=0, no-cache")))
