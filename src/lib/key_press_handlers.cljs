(ns lib.key-press-handlers
  (:require [quil.core :as q]))


(defn save-image
  "Queries to check if p was pressed, which saves the sketch to file and
  downloads it. Receives current state and returns new state for the next
  iteration."
  [state e]
  (when (= :p (:key e))
    (when-let [filename (js/prompt "Enter name of the sketch to save:")]
      (-> filename (str ".jpeg") q/save)))
  state)
