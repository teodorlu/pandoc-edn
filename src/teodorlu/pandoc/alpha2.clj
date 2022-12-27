(ns teod.pandoc.alpha2)

;; New design constraints:
;;
;;  1. No dependencies
;;  2. User chooses how to provide pandoc

;; Goals:
;;
;; - Share "pandoc EDN is a nice intermediate representation for rich text" with the Clojure ecosystem
;; - Avoid boilerplate wrapping pandoc for my own stuff

;; Development:
;;
;; - This repo should work out of the box with JVM Clojure and babashka
;; - Just use the REPL for now
;; - Don't bother testing for now

(def !runner
  "Set this to a function from list of pandoc CLI args to stdout as string.

  Example:

    (reset! pandoc/!runner runner (fn [s args] ,,, \"result\"))

  The runner represents a pandoc CLI call. This CLI call:

    echo 'good morning!' | pandoc --from markdown --to json

  Woulc be represented as->

    (runner \"Good morning!\" [\"--from\" \"markdown\" \"--to\" \"html\"])
    ;; => \"<p>good morning!</p>\"

  \"What about error handling?\"

  Not sure. I've decided to ignore errors for now and see if I can make a good
  happy path."
  (atom nil))

(comment

  (defn stuff [{:keys [pandoc-fn]}]
    (let [pandoc-fn (or pandoc-fn @!runner)]))

  (stuff {:pandoc-fn (fn [,,] ,,)})

  )
