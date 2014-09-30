SUMMARY = "GigaBlue IPBox Client"
MAINTAINER = "GigaBlue"
SECTION = "base"
LICENSE = "proprietary"
PACKAGE_ARCH = "all"

require conf/license/license-gplv2.inc

inherit gitpkgv

SRCREV = "${AUTOREV}"
PV = "1.0+git${SRCPV}"
PKGV = "1.0+git${GITPKGV}"
VER ="1.0"
PR = "r0"

RDEPENDS_${PN} = "cifs"

SRC_URI="git://git@gitlab.openmips.com/dev-openmips/gbipboxclient.git;protocol=ssh;branch=4.2-development"

S = "${WORKDIR}/git"

FILES_${PN} = "/usr/*"

pkg_postinst_${PN}() {
#!/bin/sh
echo "                                                    "
echo "              GigaBlue IPBox Client                 "
echo "                                                    "
echo "       GBIPBox Client successfully installed!       "
echo "                                                    "
echo "                Restart Enigma2!                    "
echo "                                                    "
sleep 10
exit 0
}

do_install() {
    cp -rp ${S}/usr ${D}/
}
