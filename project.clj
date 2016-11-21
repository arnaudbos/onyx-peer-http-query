(defproject org.onyxplatform/onyx-peer-http-query "0.9.13.1-SNAPSHOT"
  :description "An Onyx health and query HTTP server"
  :url "https://github.com/onyx-platform/onyx-peer-http-query"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 ^{:voom {:repo "git@github.com:onyx-platform/onyx.git" :branch "master"}}
                 [org.onyxplatform/onyx "0.9.14-20161121_175258-g9e8459a"]
                 [ring "1.4.0"]
                 [ring-jetty-component "0.3.0"]
                 [cheshire "5.5.0"]]
  :repositories {"snapshots" {:url "https://clojars.org/repo"
                              :username :env
                              :password :env
                              :sign-releases false}
                 "releases" {:url "https://clojars.org/repo"
                             :username :env
                             :password :env
                             :sign-releases false}}
  :profiles {:dev {:dependencies [[clj-http "3.2.0"]]
                   :plugins [[lein-set-version "0.4.1"]
                             [lein-update-dependency "0.1.2"]
                             [lein-pprint "1.1.1"]]}})
