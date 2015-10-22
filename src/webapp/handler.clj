(ns webapp.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [hiccup.core :as hiccup]
            [org.httpkit.server :refer [run-server]]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

  (def name "Joe")
  (defroutes app-routes
    (GET "/" [] "Hello World")
    (GET "/set/:name" [n] (swap! name n))
    (GET "/hello" []
      (hiccup/html
        [:html
          [:head [:title "yay!"]]
          [:meta {:encoding "utf-8"}]
          [:body
            [:h1 {:class "title"}
              (str "Hello " name)]]]))
    (route/not-found "Not Found"))

(defn init [] "hi")

(def app
  (wrap-defaults app-routes site-defaults))
