(ns webapp.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [hiccup.core :as hiccup]
            [org.httpkit.server :refer [run-server]]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

  (def whom "Joe")

  (defroutes app-routes
    (GET "/set/:name" [name] (def whom name))
    (GET "/" []
      (hiccup/html
        [:html
          [:head [:title "yay!"]]
          [:meta {:encoding "utf-8"}]
          [:body
            [:h1 {:class "title"}
              (str "Hello " whom)]]]))
    (route/not-found "Not Found"))

(defn init [] "hi")

(def app
  (wrap-defaults app-routes site-defaults))
