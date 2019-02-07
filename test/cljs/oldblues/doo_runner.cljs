(ns oldblues.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [oldblues.core-test]))

(doo-tests 'oldblues.core-test)

