(ns oldblues.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [oldblues.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[oldblues started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[oldblues has shut down successfully]=-"))
   :middleware wrap-dev})
