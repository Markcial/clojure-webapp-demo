(defproject webapp "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/tools.nrepl "0.2.11"]
                 [compojure "1.3.1"]
                 [http-kit "2.1.16"]
                 [ring/ring-defaults "0.1.2"]]
  :plugins [[lein-ring "0.8.13"]]
  :ring {
    :init webapp.handler/init
    :handler webapp.handler/app
    :port 8080
    :nrepl {:start? true :port 9999}
  }
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]]}})
