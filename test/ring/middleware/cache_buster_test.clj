(ns ring.middleware.cache-buster-test
  (:require [clojure.test :refer :all]
            [ring.middleware.cache-buster :refer :all]
            [ring.mock.request :as mock]
            [ring.util.response :refer [response get-header]]))

(deftest test-wrap-cache-buster
  (let [handler (wrap-cache-buster (constantly (response "")))
        response (handler (mock/request :get "/"))]
    (is (= (get-header response "cache-control")
           "private, max-age=0, no-cache"))))
