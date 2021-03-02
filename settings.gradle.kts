rootProject.name = "dagx"

include(":spi")
include(":core")

include(":extensions:protocol:web")
include(":extensions:control-http")

include(":extensions:metadata:metadata-memory")

include(":extensions:transfer:transfer-core")
include(":extensions:transfer:transfer-nifi")

include(":extensions:configuration:configuration-fs")

include(":extensions:security:security-fs")
include(":extensions:security:security-azure")
include(":extensions:iam:oauth2")

include(":extensions:ids:ids-spi")
include(":extensions:ids:ids-core")
include(":extensions:ids:ids-api-catalog")
include(":extensions:ids:ids-api-transfer")

include(":extensions:demo:demo-nifi")

include(":runtime")
include(":client")