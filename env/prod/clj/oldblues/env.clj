(ns oldblues.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[oldblues started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[oldblues has shut down successfully]=-"))
   :middleware identity})
