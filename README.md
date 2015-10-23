# webapp

FIXME

## Prerequisites

You will need [Leiningen][] 2.0.0 or above installed.

[leiningen]: https://github.com/technomancy/leiningen

## Running

To start a web server for the application, run:

    lein ring server

To connect to the remote nrepl, run:

    lein repl :connect 127.0.0.1:9999

Once inside the repl, change the scope:

    (in-ns 'webapp.handler)

Print name variable with:

     whom

 Replace name variable with:

     (def whom "Mike")

 Reload server to see the new variable loaded over http

## License

Copyright © 2015 FIXME
