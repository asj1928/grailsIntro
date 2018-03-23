package ChangedPackage

class UtilController {


    def index() {
        log.info("INFO")
        log.debug("DEBUG")
        log.fatal("FATAL")
        render "Hello world"
    }
}
