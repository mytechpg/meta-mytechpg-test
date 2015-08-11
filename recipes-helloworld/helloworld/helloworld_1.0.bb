#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

DESCRIPTION = "Simple helloworld application"
HOMEPAGE = "mytechpg.blogspot.com"
SECTION = "examples"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9081056aa059710b0594c31670e95a38"
PR = ""


SRC_URI = "git://github.com/mytechpg/helloworld.git"
SRCREV = "bfea70b29d8c0f7b8bdd463a620d50dc053bfb72"

S = "${WORKDIR}/git"

EXTRA_OEMAKE = "'CC=${CC}' 'CFLAGS=${CFLAGS}'"

do_compile() {
   oe_runmake
}

do_install() {
	     install -d ${D}${bindir}
	     install -m 0755 hello ${D}${bindir}
}
