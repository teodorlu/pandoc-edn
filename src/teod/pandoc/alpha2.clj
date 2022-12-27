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
