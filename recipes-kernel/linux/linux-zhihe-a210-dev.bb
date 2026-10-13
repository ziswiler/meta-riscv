require linux-mainline-common.inc
FILESEXTRAPATHS =. "${FILE_DIRNAME}/linux-zhihe-a210-dev:"

SUMMARY = "Zhihe A210 Dev dev kernel recipe"

inherit kernel

DEPENDS = "u-boot-mkimage-native dtc-native"

BRANCH ?= "a210-ddk25.1"
FORK ?= "revyos/a210-linux-kernel"

SRC_URI = "git://github.com/${FORK};protocol=https;branch=${BRANCH} \
           file://0001-a210_defconfig-fix-undefined-reference.patch \
           file://0002-a210_defconfig-fix-pahole-issue.patch \
           file://iwd-wifi.cfg \
"

SRCREV ?= "5ee3585de4271ff0bfd911d8aa23bec4f74f4586"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

LINUX_VERSION ?= "6.6.0"
LINUX_VERSION_EXTENSION:append:zhihe-a210-dev = "-zhihe-a210-dev"
KERNEL_VERSION_SANITY_SKIP = "1"

KERNEL_DANGLING_FEATURES_WARN_ONLY = "1"

COMPATIBLE_MACHINE = "(zhihe-a210-dev)"

KBUILD_DEFCONFIG:eswin-ebc77 ?= "a210_defconfig"
