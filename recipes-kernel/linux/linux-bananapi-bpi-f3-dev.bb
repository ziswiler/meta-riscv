require linux-mainline-common.inc
FILESEXTRAPATHS =. "${FILE_DIRNAME}/linux-bananapi-bpi-f3:"
SUMMARY = "Banana Pi BPI-F3 dev kernel recipe"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"
KERNEL_VERSION_SANITY_SKIP = "1"

SRCREV = "${AUTOREV}"

# pin srcrev for now to have a fixed target
# release 
SRCREV = "7b25153f8744304c5212d1d4de4dbf51e9e2eb7e"

BRANCH = "branch=linux-6.6.36-k1"

FORK ?= "BPI-SINOVOIP"

REPO ?= "pi-linux"

SRC_URI = " \
    git://github.com/${FORK}/${REPO}.git;protocol=https;${BRANCH} \
    file://disable-failing.patch \
"

LINUX_VERSION ?= "6.6.36"
LINUX_VERSION_EXTENSION:append = "-bpi-f3"

KBUILD_DEFCONFIG = "k1_defconfig"

COMPATIBLE_MACHINE = "(bananapi-bpi-f3)"
